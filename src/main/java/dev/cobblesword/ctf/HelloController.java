package dev.cobblesword.ctf;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import static j2html.TagCreator.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController
{
    @Get("/hello")
    @Produces(MediaType.TEXT_HTML)
    public String hello()
    {
        return html(
                head(
                        title("Hello World")
                ),
                body(
                        h1("Hello World"),
                        p("This is a paragraph"),
                        div(attrs(".my-div"),
                                p("Paragraph in a div")
                        )
                )
        ).render();
    }
}