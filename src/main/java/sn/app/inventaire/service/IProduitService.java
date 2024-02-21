package sn.app.inventaire.service;

import sn.app.inventaire.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

public interface IProduitService {
    public ProduitEntity save(ProduitEntity produitEntity);
    public ProduitEntity update(String ref, ProduitEntity produitEntity);
    public Optional<ProduitEntity> get(String ref);
    public Optional<List<ProduitEntity>> getAll();
    public void delete(String ref);
}
