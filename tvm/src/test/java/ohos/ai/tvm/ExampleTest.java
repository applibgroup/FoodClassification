package ohos.ai.tvm;

import org.junit.Test;

public class ExampleTest {
    @Test
    public void onStart() {
	final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("ohos.ai.tvm", actualBundleName);
    }
}
