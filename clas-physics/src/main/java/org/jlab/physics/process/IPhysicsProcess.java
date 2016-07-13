/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jlab.physics.process;

import java.util.Map;
import org.jlab.clas.physics.PhysicsEvent;
import org.jlab.physics.base.PhaseSpace;

/**
 *
 * @author gavalian
 */
public interface IPhysicsProcess {
    PhysicsEvent        getEvent(PhaseSpace kinematics);
    PhaseSpace          getPhaseSpace();
}
