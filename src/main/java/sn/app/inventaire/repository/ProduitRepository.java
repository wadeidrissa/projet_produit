package sn.app.inventaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.app.inventaire.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {
    @Query("SELECT p FROM ProduitEntity p WHERE p.ref = ?1")
    public Optional<ProduitEntity> FindByReference(String ref);
}
