package net.noureddine.service;

import net.noureddine.aspects.Log;
import net.noureddine.aspects.SecuredByAspect;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public void process() {
        System.out.println("Business process....");

    }

    @Override
    @SecuredByAspect(roles={"USER"})
    public double compute() {
        double data=66;
        System.out.println("Business Computing and returing....");
        return data;
    }
}
