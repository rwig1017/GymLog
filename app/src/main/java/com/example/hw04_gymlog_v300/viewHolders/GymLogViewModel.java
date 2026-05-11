package com.example.hw04_gymlog_v300.viewHolders;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.hw04_gymlog_v300.database.GymLogRepository;
import com.example.hw04_gymlog_v300.database.entities.GymLog;

import java.util.List;

public class GymLogViewModel extends AndroidViewModel {
    private final GymLogRepository repository;


    public GymLogViewModel(Application application) {
        super(application);
        repository = GymLogRepository.getRepository(application);
        //allLogsByID = repository.getAllLogsByUserIDLiveData(userID);
    }

    public LiveData<List<GymLog>> getAllLogsByID(int userID) {
        return repository.getAllLogsByUserIDLiveData(userID);
    }

    public void insert(GymLog log) {
        repository.insertGymLog(log);
    }
}