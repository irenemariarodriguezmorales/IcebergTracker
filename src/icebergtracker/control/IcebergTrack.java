
package icebergtracker.control;

import icebergtracker.model.Iceberg;
import icebergtracker.model.IcebergLocation;
import icebergtracker.persistence.IcebergRepository;
import icebergtracker.model.IcebergVolume;

public class IcebergTrack {

    private final IcebergRepository repository;
    
    public IcebergTrack() {
        repository = new IcebergRepository();
    }
    
    public IcebergRepository getRepository() {
        return repository;
    }
    
    public void show() {
        for (Iceberg i : repository.getIcebergList()) {
            System.out.println(i.toString());
            for (IcebergLocation p : repository.getLocationList()) {
                if(p.getIceberg().equals(i)) System.out.println(p.toString());
                for (IcebergVolume v : repository.getVolumeList()) {
                    if(v.getIceberg().equals(i) && v.getDate().equals(p.getDate())) System.out.println(v.toString());
                }
            }
        }
    }
}
