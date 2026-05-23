package acalidonio.labo3pnc.repository;

import acalidonio.labo3pnc.domain.entities.Specimen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface SpecimenRepository extends JpaRepository<Specimen, UUID> {
}