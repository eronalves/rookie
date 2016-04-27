package org.rookie.faker;


import org.rookie.faker.service.FakeValuesServiceInterface;

public class PhoneNumber {

    private final FakeValuesServiceInterface fakeValuesService;

    public PhoneNumber(FakeValuesServiceInterface fakeValuesService) {
        this.fakeValuesService = fakeValuesService;
    }

    public String cellPhone() {
        return fakeValuesService.numerify(fakeValuesService.fetchString("cell_phone.formats"));
    }

    public String phoneNumber() {
        return fakeValuesService.numerify(fakeValuesService.fetchString("phone_number.formats"));
    }
}
