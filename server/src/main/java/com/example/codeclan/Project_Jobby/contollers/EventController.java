package com.example.codeclan.Project_Jobby.contollers;

import com.example.codeclan.Project_Jobby.models.Event;
import com.example.codeclan.Project_Jobby.repositories.EventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EventController {

    EventRepository eventRepository;

    // GET All
    @GetMapping(value="/events")
    public ResponseEntity<List<Event>> getAllEvents(){
        return new ResponseEntity<>(eventRepository.findAll(), HttpStatus.OK);
    }

    // GET One
    @GetMapping(value = "/events/{id}")
    public ResponseEntity getEvents(@PathVariable Long id){
        return new ResponseEntity<>(eventRepository.findById(id), HttpStatus.OK);
    }

    // Save New
    @PostMapping(value = "/events")
    public ResponseEntity<Event> postEvent(@RequestBody Event event) {
        eventRepository.save(event);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    // Delete One
    @DeleteMapping(value = "/events/{id}")
    public ResponseEntity<Event> deleteEvent(@PathVariable Long id) {
        Event found = eventRepository.getOne(id);
        eventRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    // Update One
    @PutMapping(value = "/events/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) {
        Event found = eventRepository.getOne(id);
        eventRepository.save(event);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
