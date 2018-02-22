package c4q.com.app_rebuild_practice;

import java.util.List;

import c4q.com.app_rebuild_practice.modelclasses.Results;
import retrofit2.Response;

/**
 * Created by D on 2/22/18.
 */

public class User {

    private List<Response> results;

    public List<Response> getResults(){
        return results;
    }

//    public void setResults (List<Results> results){
//        this.results = results;
//    }
}
