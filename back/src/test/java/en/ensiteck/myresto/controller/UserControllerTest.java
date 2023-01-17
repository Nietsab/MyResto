package en.ensiteck.myresto.controller;

import en.ensiteck.myresto.dto.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void createUser() throws Exception {
        this.mockMvc.perform(post("/user").content("""
                        {
                        	"login":"userControle",
                        	"firstname":"qsdqsd",
                        	"lastname":"qsdqsd",
                        	"password":"qsdqsd"
                        }
                        """).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}