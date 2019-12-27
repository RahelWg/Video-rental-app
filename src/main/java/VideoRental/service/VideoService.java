package VideoRental.service;

import VideoRental.model.Video;
import VideoRental.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {

    @Autowired
    private VideoRepository repository;

    public List<Video> findAll() {
       return (List<Video>) repository.findAll();
    }
    public void save(Video video) {repository.save(video);}
    public  void delete(long id) {repository.deleteById(id);}
    public Video get(long id) {return repository.findById(id).get();}
}
