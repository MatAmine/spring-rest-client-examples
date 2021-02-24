//package guru.springframework.springrestclientexamples.services;
//
//import guru.springframework.api.domain.User;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class ApiServiceImplTest {
//
//    @Autowired
//    ApiService apiService;
//
//    @Test
//    void testGetUsers() throws Exception {
//        int limit = 1;
//        List<User> users = apiService.getUsers(limit);
//        assertEquals(1, users.size());
//    }
//}