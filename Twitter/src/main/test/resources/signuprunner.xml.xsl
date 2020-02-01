<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite name="sign up Tests" parallel="false">

    <parameter name="cloud" value="false"/>
    <parameter name="envName" value="browserstack"/>
    <parameter name="os" value="Windows"/>
    <parameter name="browserName" value="firefox"/>
    <parameter name="browserVersion" value="72 .0"/>
    <parameter name="url" value="https://www.twitter.com"/>


    <test name = "sign up page">
        <classes>
            <class name="signup.SignUpTest"/>
        </classes>
    </test>

</suite>