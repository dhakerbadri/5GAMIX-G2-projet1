package tn.esprit.spring.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Subscription;
import tn.esprit.spring.repositories.ISkierRepository;
import tn.esprit.spring.repositories.ISubscriptionRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SubscriptionServicesImplTest {
    @Mock
    private ISubscriptionRepository subscriptionRepository;
    @Mock
    SubscriptionServicesImpl subscriptionServices;
    @Mock
    private ISkierRepository skierRepository;
    @Test
    @DisplayName("Get Subscription by id")
    void test_when_subsc_success(){
        /*
        //Mocking
        Subscription subscription =getMockSubc();
        Mockito.when(subscriptionRepository.findById(1L)).thenReturn(Optional.ofNullable(subscription));

        //Actual
        Subscription subRepo=subscriptionServices.retrieveSubscriptionById(1L);
        Mockito.verify(subscriptionRepository,Mockito.times(1)).findById(1L);

        //Assert
        Assertions.assertNotNull(subRepo);
*/
    }
    private Subscription getMockSubc(){
        return Subscription.builder()
        .numSub(1L).price(10F).build();
    }

}