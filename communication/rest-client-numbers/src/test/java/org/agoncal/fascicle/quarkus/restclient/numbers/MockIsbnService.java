// tag::adocTest[]
package org.agoncal.fascicle.quarkus.restclient.numbers;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;

// tag::adocSnippet[]
@Mock
@ApplicationScoped
@RestClient
public class MockIsbnService implements IsbnService {

  @Override
  public IsbnNumber generateIsbn() {
    IsbnNumber isbnNumber = new IsbnNumber();
    isbnNumber.isbn13 = "dummy isbn 13";
    isbnNumber.gs1 = "dummy gs1";
    return isbnNumber;
  }
}
// end::adocSnippet[]
