package hms_models;

public class Vitals {
    private Integer id;
    private Integer encounterId;
    private String bp; // Blood pressure
    private Integer pulse;
    private Double temperature;
    private Integer respRate; // Respiratory rate
    private Integer spo2; // Oxygen saturation
    private Double weight;
    private Double height;

    // Constructors
    public Vitals() {}

    public Vitals(Integer encounterId, String bp, Integer pulse, Double temperature, 
                  Integer respRate, Integer spo2, Double weight, Double height) {
        this.encounterId = encounterId;
        this.bp = bp;
        this.pulse = pulse;
        this.temperature = temperature;
        this.respRate = respRate;
        this.spo2 = spo2;
        this.weight = weight;
        this.height = height;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getRespRate() {
        return respRate;
    }

    public void setRespRate(Integer respRate) {
        this.respRate = respRate;
    }

    public Integer getSpo2() {
        return spo2;
    }

    public void setSpo2(Integer spo2) {
        this.spo2 = spo2;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vitals{" +
                "id=" + id +
                ", encounterId=" + encounterId +
                ", bp='" + bp + '\'' +
                ", pulse=" + pulse +
                ", temperature=" + temperature +
                ", respRate=" + respRate +
                ", spo2=" + spo2 +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
