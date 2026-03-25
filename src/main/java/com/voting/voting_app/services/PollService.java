package com.voting.voting_app.services;

import com.voting.voting_app.model.Poll;
import com.voting.voting_app.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    private final PollRepository pollRepository;
    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
