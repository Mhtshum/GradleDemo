import demo.Person;
import demo.PersonContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        PersonContext.class
})
    public class PersonTest {

        @Mock
        private PersonContext personContext;

        @InjectMocks
        private Person person;

        @Before
        public void setUp() {
            MockitoAnnotations.initMocks(this);
        }


        @Test
        public void personIsAdult() throws Exception {
            PowerMockito.mockStatic(PersonContext.class);
            when(PersonContext.getInstance()).thenReturn(personContext);
            when(personContext.isMale()).thenReturn(true);

            //act
            person.check();
            verify(personContext, never()).isAdult();

        }
    }

