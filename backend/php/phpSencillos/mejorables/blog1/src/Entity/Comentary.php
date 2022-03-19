<?php

namespace App\Entity;

use App\Repository\ComentaryRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=ComentaryRepository::class)
 */
class Comentary
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
    private $author;

    /**
     * @ORM\Column(type="string", length=255)
     */
    private $text;

    /**
     * @ORM\Column(type="datetime")
     */
    private $datePublication;

    /**
     * @ORM\ManyToOne(targetEntity=Article::class, inversedBy="comentaries")
     */
    private $article;

    /**
     * @ORM\Column(type="boolean")
     */
    private $status;

    /**
     * @ORM\ManyToOne(targetEntity=Comentary::class, inversedBy="comentaries")
     */
    private $comentary;

    /**
     * @ORM\OneToMany(targetEntity=Comentary::class, mappedBy="comentary")
     */
    private $comentaries;

    public function __construct()
    {
        $this->comentaries = new ArrayCollection();
    }

    

    

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getAuthor(): ?string
    {
        return $this->author;
    }

    public function setAuthor(string $author): self
    {
        $this->author = $author;

        return $this;
    }

    public function getText(): ?string
    {
        return $this->text;
    }

    public function setText(string $text): self
    {
        $this->text = $text;

        return $this;
    }

    public function getDatePublication(): ?\DateTimeInterface
    {
        return $this->datePublication;
    }

    public function setDatePublication(\DateTimeInterface $datePublication): self
    {
        $this->datePublication = $datePublication;

        return $this;
    }

    public function getArticle(): ?Article
    {
        return $this->article;
    }

    public function setArticle(?Article $article): self
    {
        $this->article = $article;

        return $this;
    }

    public function __toString() {
        return $this->author . ": " . $this->text;
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

    public function getComentary(): ?self
    {
        return $this->comentary;
    }

    public function setComentary(?self $comentary): self
    {
        $this->comentary = $comentary;

        return $this;
    }

    /**
     * @return Collection|self[]
     */
    public function getComentaries(): Collection
    {
        return $this->comentaries;
    }

    public function addComentary(self $comentary): self
    {
        if (!$this->comentaries->contains($comentary)) {
            $this->comentaries[] = $comentary;
            $comentary->setComentary($this);
        }

        return $this;
    }

    public function removeComentary(self $comentary): self
    {
        if ($this->comentaries->removeElement($comentary)) {
            // set the owning side to null (unless already changed)
            if ($comentary->getComentary() === $this) {
                $comentary->setComentary(null);
            }
        }

        return $this;
    }

    
    
}
