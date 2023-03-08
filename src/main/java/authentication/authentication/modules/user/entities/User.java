package authentication.authentication.modules.user.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  @GeneratedValue
  private UUID id;

  private String name;

  private String username;

  private String password;

  private String telefone;

  private String email;

  private LocalDate criadoEm;

  private LocalDate alteradoEm;

  private String fotoUrl;

  @ManyToMany
  private List<Role> roles;
}
