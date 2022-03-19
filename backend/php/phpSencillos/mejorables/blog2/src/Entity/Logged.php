<?php

namespace App\Entity;

use App\Repository\LoggedRepository;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=LoggedRepository::class)
 */
class Logged
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     */
    private $id;

    /**
     * @ORM\Column(type="datetime")
     */
    private $fechaEntrada;

    /**
     * @ORM\Column(type="datetime", nullable=true)
     */
    private $fechaSalida;

    /**
     * @ORM\ManyToOne(targetEntity=User::class, inversedBy="loggeds")
     */
    private $empleado;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getFechaEntrada(): ?\DateTimeInterface
    {
        return $this->fechaEntrada;
    }

    public function setFechaEntrada(\DateTimeInterface $fechaEntrada): self
    {
        $this->fechaEntrada = $fechaEntrada;

        return $this;
    }

    public function getFechaSalida(): ?\DateTimeInterface
    {
        return $this->fechaSalida;
    }

    public function setFechaSalida(\DateTimeInterface $fechaSalida): self
    {
        $this->fechaSalida = $fechaSalida;

        return $this;
    }

    public function getEmpleado(): ?User
    {
        return $this->empleado;
    }

    public function setEmpleado(?User $empleado): self
    {
        $this->empleado = $empleado;

        return $this;
    }

    public function __toString() {
        return $this->fechaEntrada->format("Y-MM-dd HH:mm:ss");
        return $this->fechaSalida->format("Y-MM-dd HH:mm:ss");
    }
}
