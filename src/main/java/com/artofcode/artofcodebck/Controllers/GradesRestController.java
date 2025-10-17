package com.artofcode.artofcodebck.Controllers;

import com.artofcode.artofcodebck.Entities.Competition;
import com.artofcode.artofcodebck.Entities.Grades;
import com.artofcode.artofcodebck.Services.Competition.ICompetitionService;
import com.artofcode.artofcodebck.Services.Grades.IGradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
@CrossOrigin("http://localhost:4200")
public class GradesRestController {

    @Autowired
    private IGradesService gradesService;

    @GetMapping("/{IdGrade}")
    public Grades getGradesById(@PathVariable(name = "IdGrade") Long id){
        return gradesService.getGradesById(id);
    }

    @GetMapping("/allGrades")
    public List<Grades> getAllGrades(){
        return gradesService.getAllGrades();
    }

    @PostMapping("/addGrades/{idCandidacy}")
    public Grades addGrades(@RequestBody Grades grades,@PathVariable("idCandidacy") Long idCandidacy){
        return gradesService.addGrades(grades,idCandidacy);
    }

    @PutMapping("/updateGrades")
    public Grades updateGrades(@RequestBody Grades grades){
        return gradesService.updateGrades(grades);
    }

    @DeleteMapping("/deleteGrades/{IdGrade}")
    public void deleteGrades(@PathVariable(name = "IdGrade") Long id){
        gradesService.deleteGrades(id);
    }

}
