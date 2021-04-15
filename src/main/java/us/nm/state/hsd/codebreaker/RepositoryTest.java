package us.nm.state.hsd.codebreaker;

import java.util.UUID;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import us.nm.state.hsd.codebreaker.model.dao.CodeRepository;

@Component
public class RepositoryTest implements CommandLineRunner {
  private final CodeRepository repository;
  
  public RepositoryTest(CodeRepository repository) {
    this.repository = repository;
  }
  
  @Override
  public void run(String... args) throws Exception {
//    repository.add( 4, "ABCDEF", "AAAA");
    System.out.println(repository.getAll());
  }

}
