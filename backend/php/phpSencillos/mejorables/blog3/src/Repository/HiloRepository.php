<?php

namespace App\Repository;

use App\Entity\Hilo;
use Doctrine\Bundle\DoctrineBundle\Repository\ServiceEntityRepository;
use Doctrine\Persistence\ManagerRegistry;

/**
 * @method Hilo|null find($id, $lockMode = null, $lockVersion = null)
 * @method Hilo|null findOneBy(array $criteria, array $orderBy = null)
 * @method Hilo[]    findAll()
 * @method Hilo[]    findBy(array $criteria, array $orderBy = null, $limit = null, $offset = null)
 */
class HiloRepository extends ServiceEntityRepository
{
    public function __construct(ManagerRegistry $registry)
    {
        parent::__construct($registry, Hilo::class);
    }

    // /**
    //  * @return Hilo[] Returns an array of Hilo objects
    //  */
    /*
    public function findByExampleField($value)
    {
        return $this->createQueryBuilder('h')
            ->andWhere('h.exampleField = :val')
            ->setParameter('val', $value)
            ->orderBy('h.id', 'ASC')
            ->setMaxResults(10)
            ->getQuery()
            ->getResult()
        ;
    }
    */

    /*
    public function findOneBySomeField($value): ?Hilo
    {
        return $this->createQueryBuilder('h')
            ->andWhere('h.exampleField = :val')
            ->setParameter('val', $value)
            ->getQuery()
            ->getOneOrNullResult()
        ;
    }
    */
}
