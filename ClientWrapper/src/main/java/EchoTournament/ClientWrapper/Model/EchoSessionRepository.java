package EchoTournament.ClientWrapper.Model;


import org.springframework.data.repository.CrudRepository;

public interface EchoSessionRepository extends CrudRepository<EchoSessionModel, Long> {

    EchoSessionModel findPlyId(String id);
}
