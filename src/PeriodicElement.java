/**
 * Created by Denzel on 5/22/2016.
 */
public class PeriodicElement {
    private String atomicName;
    private Integer atomicNumber;
    private String atomicSymbol;
    private Double atomicWeight;

    //Constructors
    public PeriodicElement(Integer atomicNumber, String atomicName, String atomicSymbol, Double atomicWeight){
        this.atomicNumber = atomicNumber;
        this.atomicName = atomicName;
        this.atomicSymbol = atomicSymbol;
        this.atomicWeight = atomicWeight;
    }

    //Getters
    public String getAtomicSymbol() {
        return atomicSymbol;
    }

    public Double getAtomicWeight() {
        return atomicWeight;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public String getAtomicName() {
        return atomicName;
    }
}

