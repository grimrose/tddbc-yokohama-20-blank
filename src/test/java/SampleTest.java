import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SampleTest {

    @Test
    public void _sayを実行するとhello_worldが返ってくる() throws Exception {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertThat(actual, is("hello world."));
    }

}
