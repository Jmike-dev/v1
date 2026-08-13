package springlab_V1.v1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // CRUD methods (save, findById, findAll, deleteById...) come for free
}
