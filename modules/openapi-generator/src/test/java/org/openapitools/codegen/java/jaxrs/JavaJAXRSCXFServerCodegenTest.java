package org.openapitools.codegen.java.jaxrs;

import org.openapitools.codegen.languages.JavaCXFServerCodegen;
import org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen;
import org.testng.annotations.BeforeMethod;

public class JavaJAXRSCXFServerCodegenTest extends JavaJaxrsBaseTest {

    @BeforeMethod
    public void beforeMethod() {
        codegen = new JavaCXFServerCodegen();
    }
}
