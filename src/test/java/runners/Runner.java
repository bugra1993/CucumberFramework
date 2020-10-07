package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // senaryolarımızı çalıştırabilmek için..
@CucumberOptions( // frameworkumuz ile ilgili bilgileri ve secenekleri ekledigimiz bolum
        plugin = {"html:target/default-cucumber-reports"}, // HTML formatında rapor oluşturmak için..
        features = "src/test/resources/features", // senaryolarımızın içerisinde bulundupu "features" klasörünün adresi..
        glue = "stepdefinitions", // test adımlarımızın methodlarının içerisinde bulunduğu paketin adını yazdık..
        tags = "@ebay", // çalıştırmak istediğimiz "feature" ya da "senaryo"nun @tag ismini yazıyoruz
        dryRun = false // senaryolarımızın içerisindeki adımlara ait herhangi bir eksik method varsa, bu methodları
        // konsoldan kopyalayabilmek için, dryRun=true yazıyoruz.
        // dryRun = true dersek, testlerimiz çalışmaz SADECE eklenmesi gereken methodlar gösterilir.
        // eğer dryRun = false derseniz, bu durumda direk testinizi çalıştırır.
)
public class Runner {
}
