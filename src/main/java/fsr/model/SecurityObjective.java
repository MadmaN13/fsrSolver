package fsr.model;

import java.util.List;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class SecurityObjective {
    private String name;
    private List<FunctionalSecurityRequirement> fsrs;

    public SecurityObjective(String name, List<FunctionalSecurityRequirement> fsrs) {
        this.name = name;
        this.fsrs = fsrs;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(this.getClass().getName())
                .append(" = {").append("name = ").append(getName()).append(";\r\n")
                .append("Fsrs = {\r\n");
        getFsrs().forEach(f -> b.append(f.toString()).append("\r\n"));
        b.append("\t\t}").append("\r\n}");
        return b.toString();
    }

    // ACCESSORS
    public String getName() {
        return name;
    }
    public List<FunctionalSecurityRequirement> getFsrs() {
        return fsrs;
    }
}
