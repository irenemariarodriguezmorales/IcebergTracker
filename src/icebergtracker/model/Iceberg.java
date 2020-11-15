
package icebergtracker.model;

import icebergtracker.control.IcebergTrack;
import java.time.LocalDate;

public class Iceberg {

    private final int id;
    private final Origin origin;
    private final LocalDate spawnDate;
    
    public static void main(String[] args) {
       IcebergTrack icebergTracker = new IcebergTrack();
       icebergTracker.getRepository().load();
       icebergTracker.show();
    }
    
    public Iceberg(int id, Origin origin, LocalDate spawnDate) {
        this.id = id;
        this.origin = origin;
        this.spawnDate = spawnDate;
    }
    public int getId() {
        return id;
    }
    
    public Origin getOrigin() {
        return origin;
    }
    
    public LocalDate getSpawnDate() {
        return spawnDate;
    }
    
    @Override
    public String toString() {
        return "Iceberg con id: " + id + ", con origen en  " + origin + 
                " y con fecha de aparición " + spawnDate;
    }
     
}
