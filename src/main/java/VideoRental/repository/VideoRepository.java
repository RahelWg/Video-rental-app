package VideoRental.repository;

import VideoRental.model.Video;
import VideoRental.service.VideoService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

    static VideoService findOne(Video id) {
        return null;
    }
}

