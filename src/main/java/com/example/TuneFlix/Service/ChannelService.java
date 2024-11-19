package com.example.TuneFlix.Service;

import com.example.TuneFlix.Entity.Channel;
import com.example.TuneFlix.Repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public List<Channel> getAllChannels() {
        return channelRepository.findAll();
    }

    public Channel createChannel(Channel channel) {
        return channelRepository.save(channel);
    }

    public Channel updateChannel(Long id, Channel channel) {
        Channel existingChannel = channelRepository.findById(id).orElseThrow(() -> new RuntimeException("Channel not found"));
        existingChannel.setName(channel.getName());
        existingChannel.setDescription(channel.getDescription());
        return channelRepository.save(existingChannel);
    }

    public void deleteChannel(Long id) {
        channelRepository.deleteById(id);
    }
}

