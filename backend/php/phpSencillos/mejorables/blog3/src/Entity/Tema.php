<?php

namespace App\Entity;

use App\Repository\TemaRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=TemaRepository::class)
 */
class Tema
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $titulo;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $descripcion;

    /**
     * @ORM\Column(type="datetime")
     */
    private $fecha;

    /**
     * @ORM\Column(type="boolean")
     */
    private $status;

    /**
     * @ORM\ManyToOne(targetEntity=Foro::class, inversedBy="temas")
     */
    private $foro;

    /**
     * @ORM\OneToMany(targetEntity=Hilo::class, mappedBy="tema")
     */
    private $hilos;

    public function __construct()
    {
        $this->hilos = new ArrayCollection();
    }

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getTitulo(): ?string
    {
        return $this->titulo;
    }

    public function setTitulo(string $titulo): self
    {
        $this->titulo = $titulo;

        return $this;
    }

    public function getDescripcion(): ?string
    {
        return $this->descripcion;
    }

    public function setDescripcion(string $descripcion): self
    {
        $this->descripcion = $descripcion;

        return $this;
    }

    public function getFecha(): ?\DateTimeInterface
    {
        return $this->fecha;
    }

    public function setFecha(\DateTimeInterface $fecha): self
    {
        $this->fecha = $fecha;

        return $this;
    }

    public function getStatus(): ?bool
    {
        return $this->status;
    }

    public function setStatus(bool $status): self
    {
        $this->status = $status;

        return $this;
    }

    public function getForo(): ?Foro
    {
        return $this->foro;
    }

    public function setForo(?Foro $foro): self
    {
        $this->foro = $foro;

        return $this;
    }

    /**
     * @return Collection|Hilo[]
     */
    public function getHilos(): Collection
    {
        return $this->hilos;
    }

    public function addHilo(Hilo $hilo): self
    {
        if (!$this->hilos->contains($hilo)) {
            $this->hilos[] = $hilo;
            $hilo->setTema($this);
        }

        return $this;
    }

    public function removeHilo(Hilo $hilo): self
    {
        if ($this->hilos->removeElement($hilo)) {
            // set the owning side to null (unless already changed)
            if ($hilo->getTema() === $this) {
                $hilo->setTema(null);
            }
        }

        return $this;
    }
}
