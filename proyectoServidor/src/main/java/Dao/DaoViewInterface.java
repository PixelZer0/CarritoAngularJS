package Dao;

import Helper.FilterBeanHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author Julian
 * @param <GenericBeanImplementation>
 */

public interface DaoViewInterface<GenericBeanImplementation> {
 
    public Long getcount(ArrayList<FilterBeanHelper> alFilter) throws Exception;
 
    public ArrayList<GenericBeanImplementation> getpage(int intRegsPerPag, int intPage, LinkedHashMap<String,String> hmOrder, ArrayList<FilterBeanHelper> alFilter) throws Exception;
 
}
