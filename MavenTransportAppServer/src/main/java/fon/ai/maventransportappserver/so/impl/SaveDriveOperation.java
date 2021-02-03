/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappserver.so.impl;

import fon.ai.maventransportappcommon.domain.Cost;
import fon.ai.maventransportappcommon.domain.Drive;
import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

/**
 *
 * @author Windows HD
 */
public class SaveDriveOperation extends AbstractGenericOperation{
    

    @Override
    public void validate(Object entity) throws Exception {
        if(!(entity instanceof Drive)) {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    public void execute(Object entity) throws Exception {
        Drive d = (Drive) entity;
        db.sacuvaj((IGeneralEntity) entity);
        System.out.println("DOSAO DOVDE");
        if(d.getCosts() == null)
            return;
        for(Cost c : d.getCosts()){
            c.setDrive(d);
            db.sacuvaj((IGeneralEntity)c);
        }
    }
    
    
}
