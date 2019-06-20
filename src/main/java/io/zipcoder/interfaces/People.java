package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    protected List <E> personList;
    public People(){personList = new ArrayList<E>(); }
    public People(List<E> personlist){
        this.personList=  personlist;
    }

    public void add(E person){
        personList.add(person);
    }

    public E findByID(long id){
        for(E per:personList)
        if(per.getId()==id||per.equals(id))
             return per;
        return null;
    }

    public boolean contains(Person person){
        if(personList.contains(person))
            return true;
        else
            return false;
    }

    public void remove(Person person){
     personList.remove(person);
    }

    public void removeById(long id){
        personList.remove(id);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }
    public abstract E[] getArray();
       // return personList.toArray(new E[personList.size()]);



    public Iterator<E> iterator() {
        Iterator<E> itr=personList.iterator();
        return itr;
    }
}
