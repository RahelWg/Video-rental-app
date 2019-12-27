package VideoRental.controller;

import VideoRental.model.Video;
import VideoRental.repository.VideoRepository;
import VideoRental.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/showVideos")
    public String findVideos(Model model) {
        model.addAttribute("videos", videoService.findAll());
        return "showVideos";

    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model, Video video) {
        model.addAttribute("video", video);
        return "create";
    }

    @RequestMapping(value = "/addVideo", method = RequestMethod.POST)
    public String addVideo(@ModelAttribute("video") Video video)
    {
        videoService.save(video);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") long id, Model model){
        videoService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model){
        model.addAttribute("videos", videoService.findAll());
        return "admin";
    }

}
