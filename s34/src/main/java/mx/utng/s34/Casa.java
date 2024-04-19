package mx.utng.s34;

@Entity
public class Casa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jefeDeFamilia;
    @ElementCollection
    private Collection<String> otros;

    public Long getId() {
        return id;
    }
    
}