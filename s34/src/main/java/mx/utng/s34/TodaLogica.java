package mx.utng.s34;
public class TodaLogica {
    private final CasaRepository repository;
    @Autowired
    public TodaLogica(CasaRepository repository){
        this.repository=repository;
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public void guardarCasa(@RequestBody Casa casa){
        if(casa.getJefeDeFamilia()==null){
            throw new RuntimeException("Se debe tener un jefe de familia");
        }
        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        ArrayList<String> otrosMayusculas=new ArrayList<>();
        for (String nombre : otrosMayusculas) {
            otrosMayusculas.add(nombre.toUpperCase());
        }
        casa.setOtros(otrosMayusculas);

        repository.save(casa);
    }
}
