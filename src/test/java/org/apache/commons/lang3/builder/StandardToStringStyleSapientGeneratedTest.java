package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardToStringStyleSapientGeneratedTest {

    //Sapient generated method id: ${5c2cca6d-4081-3a76-8051-53d020af4a27}
    @Test()
    void isUseClassNameWhenSuperIsUseClassName() {
        /* Branches:
         * (super.isUseClassName()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseClassName(true);

        //Act Statement(s)
        boolean result = target.isUseClassName();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${d1b48f43-ae87-36b7-b0be-b84caf595972}
    @Test()
    void isUseClassNameWhenSuperNotIsUseClassName() {
        /* Branches:
         * (super.isUseClassName()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseClassName(false);

        //Act Statement(s)
        boolean result = target.isUseClassName();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9e394696-81c7-3cef-ab25-69bf7c9d2898}
    @Test()
    void setUseClassNameTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setUseClassName(false);
    }

    //Sapient generated method id: ${5c2aae38-7070-3362-bc30-6ba4de89dc09}
    @Test()
    void isUseShortClassNameWhenSuperIsUseShortClassName() {
        /* Branches:
         * (super.isUseShortClassName()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseShortClassName(true);

        //Act Statement(s)
        boolean result = target.isUseShortClassName();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${e910a403-37f7-3790-91b1-2a6f1a8cd813}
    @Test()
    void isUseShortClassNameWhenSuperNotIsUseShortClassName() {
        /* Branches:
         * (super.isUseShortClassName()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseShortClassName(false);

        //Act Statement(s)
        boolean result = target.isUseShortClassName();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${7e6403a2-f71a-376e-a11a-d7be54937260}
    @Test()
    void setUseShortClassNameTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setUseShortClassName(false);
    }

    //Sapient generated method id: ${71b57eab-744a-3ce5-bced-171a9a15ceb2}
    @Test()
    void isUseIdentityHashCodeWhenSuperIsUseIdentityHashCode() {
        /* Branches:
         * (super.isUseIdentityHashCode()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseIdentityHashCode(true);

        //Act Statement(s)
        boolean result = target.isUseIdentityHashCode();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${cc99aa33-e13c-3b36-b92b-361a255a6ceb}
    @Test()
    void isUseIdentityHashCodeWhenSuperNotIsUseIdentityHashCode() {
        /* Branches:
         * (super.isUseIdentityHashCode()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseIdentityHashCode(false);

        //Act Statement(s)
        boolean result = target.isUseIdentityHashCode();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${dcf36b1f-5eea-3919-b891-d90d2affb562}
    @Test()
    void setUseIdentityHashCodeTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setUseIdentityHashCode(false);
    }

    //Sapient generated method id: ${b1c26666-b0f3-3381-8d20-201af91f77ee}
    @Test()
    void isUseFieldNamesWhenSuperIsUseFieldNames() {
        /* Branches:
         * (super.isUseFieldNames()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseFieldNames(true);

        //Act Statement(s)
        boolean result = target.isUseFieldNames();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${f4866dde-8736-3b6a-8988-e01ed5d13e44}
    @Test()
    void isUseFieldNamesWhenSuperNotIsUseFieldNames() {
        /* Branches:
         * (super.isUseFieldNames()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setUseFieldNames(false);

        //Act Statement(s)
        boolean result = target.isUseFieldNames();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c14e6726-9059-3944-a34b-26bd52a821f8}
    @Test()
    void setUseFieldNamesTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setUseFieldNames(false);
    }

    //Sapient generated method id: ${fe2b8b3b-88d2-3cd2-b246-eaa9419224cc}
    @Test()
    void isDefaultFullDetailWhenSuperIsDefaultFullDetail() {
        /* Branches:
         * (super.isDefaultFullDetail()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setDefaultFullDetail(true);

        //Act Statement(s)
        boolean result = target.isDefaultFullDetail();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${0e602174-c183-3854-b6df-02b24f22572e}
    @Test()
    void isDefaultFullDetailWhenSuperNotIsDefaultFullDetail() {
        /* Branches:
         * (super.isDefaultFullDetail()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setDefaultFullDetail(false);

        //Act Statement(s)
        boolean result = target.isDefaultFullDetail();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${cadf1e72-5b1f-3701-b6b8-aa8c446b677b}
    @Test()
    void setDefaultFullDetailTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setDefaultFullDetail(false);
    }

    //Sapient generated method id: ${3044d96e-dbef-3406-af02-e4038b7ddf61}
    @Test()
    void isArrayContentDetailWhenSuperIsArrayContentDetail() {
        /* Branches:
         * (super.isArrayContentDetail()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setArrayContentDetail(true);

        //Act Statement(s)
        boolean result = target.isArrayContentDetail();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${65960ea8-3918-3a31-8ac2-d544364caf83}
    @Test()
    void isArrayContentDetailWhenSuperNotIsArrayContentDetail() {
        /* Branches:
         * (super.isArrayContentDetail()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setArrayContentDetail(false);

        //Act Statement(s)
        boolean result = target.isArrayContentDetail();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${b6769103-65fd-3e79-9eda-d08cb9bc8056}
    @Test()
    void setArrayContentDetailTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setArrayContentDetail(false);
    }

    //Sapient generated method id: ${e43080eb-00b6-3604-b47a-c45134a713e3}
    @Test()
    void getArrayStartTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setArrayStart("arrayStart1");

        //Act Statement(s)
        String result = target.getArrayStart();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("arrayStart1")));
    }

    //Sapient generated method id: ${efd20bd9-2901-3704-8420-eb0a1ba62a5b}
    @Test()
    void setArrayStartWhenArrayStartIsNull() {
        /* Branches:
         * (arrayStart == null) : true  #  inside setArrayStart method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setArrayStart((String) null);
    }

    //Sapient generated method id: ${6dc80005-bc11-38e1-bf39-a03359718a86}
    @Test()
    void getArrayEndTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setArrayEnd("arrayEnd1");

        //Act Statement(s)
        String result = target.getArrayEnd();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("arrayEnd1")));
    }

    //Sapient generated method id: ${e7cfa4b2-c4e8-312a-9f9e-41cff31c58f8}
    @Test()
    void setArrayEndWhenArrayEndIsNull() {
        /* Branches:
         * (arrayEnd == null) : true  #  inside setArrayEnd method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setArrayEnd((String) null);
    }

    //Sapient generated method id: ${f8a85b09-4be9-365d-8e5e-cc5310d3dbda}
    @Test()
    void getArraySeparatorTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setArraySeparator("arraySeparator1");

        //Act Statement(s)
        String result = target.getArraySeparator();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("arraySeparator1")));
    }

    //Sapient generated method id: ${96af9ed3-5ba6-38f3-bc74-64ef762936b8}
    @Test()
    void setArraySeparatorWhenArraySeparatorIsNull() {
        /* Branches:
         * (arraySeparator == null) : true  #  inside setArraySeparator method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setArraySeparator((String) null);
    }

    //Sapient generated method id: ${90e2212f-bec4-3ba9-8b3d-fed2afb1321b}
    @Test()
    void getContentStartTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setContentStart("contentStart1");

        //Act Statement(s)
        String result = target.getContentStart();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("contentStart1")));
    }

    //Sapient generated method id: ${fe156f67-a205-3587-90da-adad59aa08cb}
    @Test()
    void setContentStartWhenContentStartIsNull() {
        /* Branches:
         * (contentStart == null) : true  #  inside setContentStart method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setContentStart((String) null);
    }

    //Sapient generated method id: ${21455ee3-63e6-3d6d-a87e-8bd965710e5d}
    @Test()
    void getContentEndTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setContentEnd("contentEnd1");

        //Act Statement(s)
        String result = target.getContentEnd();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("contentEnd1")));
    }

    //Sapient generated method id: ${9b9fc0ea-356c-31bf-a50d-b7552c5f64e9}
    @Test()
    void setContentEndWhenContentEndIsNull() {
        /* Branches:
         * (contentEnd == null) : true  #  inside setContentEnd method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setContentEnd((String) null);
    }

    //Sapient generated method id: ${0db7e04f-7974-3be4-823b-44c5e4e99693}
    @Test()
    void getFieldNameValueSeparatorTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldNameValueSeparator("fieldNameValueSeparator1");

        //Act Statement(s)
        String result = target.getFieldNameValueSeparator();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("fieldNameValueSeparator1")));
    }

    //Sapient generated method id: ${9e3d61ff-4f5b-3b0d-820a-74837a861bfe}
    @Test()
    void setFieldNameValueSeparatorWhenFieldNameValueSeparatorIsNull() {
        /* Branches:
         * (fieldNameValueSeparator == null) : true  #  inside setFieldNameValueSeparator method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setFieldNameValueSeparator((String) null);
    }

    //Sapient generated method id: ${7738af40-97c0-3096-ae83-89dedfc4cf7d}
    @Test()
    void getFieldSeparatorTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldSeparator("fieldSeparator1");

        //Act Statement(s)
        String result = target.getFieldSeparator();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("fieldSeparator1")));
    }

    //Sapient generated method id: ${278d3887-45ff-308e-9c31-1191b06b2bd9}
    @Test()
    void setFieldSeparatorWhenFieldSeparatorIsNull() {
        /* Branches:
         * (fieldSeparator == null) : true  #  inside setFieldSeparator method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setFieldSeparator((String) null);
    }

    //Sapient generated method id: ${dd1e48ff-5938-3b8b-8a1f-8a24147b4b1e}
    @Test()
    void isFieldSeparatorAtStartWhenSuperIsFieldSeparatorAtStart() {
        /* Branches:
         * (super.isFieldSeparatorAtStart()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldSeparatorAtStart(true);

        //Act Statement(s)
        boolean result = target.isFieldSeparatorAtStart();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${91025fb7-0219-3272-a8a6-955a3493218b}
    @Test()
    void isFieldSeparatorAtStartWhenSuperNotIsFieldSeparatorAtStart() {
        /* Branches:
         * (super.isFieldSeparatorAtStart()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldSeparatorAtStart(false);

        //Act Statement(s)
        boolean result = target.isFieldSeparatorAtStart();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4fd487d7-fef1-3c37-90c3-573782f34d5a}
    @Test()
    void setFieldSeparatorAtStartTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setFieldSeparatorAtStart(false);
    }

    //Sapient generated method id: ${2b191f06-1469-396a-89e7-ec81beec54e5}
    @Test()
    void isFieldSeparatorAtEndWhenSuperIsFieldSeparatorAtEnd() {
        /* Branches:
         * (super.isFieldSeparatorAtEnd()) : true
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldSeparatorAtEnd(true);

        //Act Statement(s)
        boolean result = target.isFieldSeparatorAtEnd();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${791df892-2b0d-318f-b121-279c7e70386e}
    @Test()
    void isFieldSeparatorAtEndWhenSuperNotIsFieldSeparatorAtEnd() {
        /* Branches:
         * (super.isFieldSeparatorAtEnd()) : false
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setFieldSeparatorAtEnd(false);

        //Act Statement(s)
        boolean result = target.isFieldSeparatorAtEnd();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${332e8da2-9398-3436-a57f-d26b7e2515d7}
    @Test()
    void setFieldSeparatorAtEndTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setFieldSeparatorAtEnd(false);
    }

    //Sapient generated method id: ${80914e0f-1842-3cfb-aa9d-c712f196c4de}
    @Test()
    void getNullTextTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setNullText("nullText1");

        //Act Statement(s)
        String result = target.getNullText();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("nullText1")));
    }

    //Sapient generated method id: ${13cdead9-f262-3897-8a29-46bcc1f14f01}
    @Test()
    void setNullTextWhenNullTextIsNull() {
        /* Branches:
         * (nullText == null) : true  #  inside setNullText method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setNullText((String) null);
    }

    //Sapient generated method id: ${b544c7a1-60ba-3898-81ae-8b37beed1f45}
    @Test()
    void getSizeStartTextTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setSizeStartText("sizeStartText1");

        //Act Statement(s)
        String result = target.getSizeStartText();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("sizeStartText1")));
    }

    //Sapient generated method id: ${40b33774-4460-376d-ba12-470b0406e28b}
    @Test()
    void setSizeStartTextWhenSizeStartTextIsNull() {
        /* Branches:
         * (sizeStartText == null) : true  #  inside setSizeStartText method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setSizeStartText((String) null);
    }

    //Sapient generated method id: ${32542a27-81c3-381f-999e-f976046c3831}
    @Test()
    void getSizeEndTextTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setSizeEndText("sizeEndText1");

        //Act Statement(s)
        String result = target.getSizeEndText();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("sizeEndText1")));
    }

    //Sapient generated method id: ${a0c6518e-c327-3e31-a386-6ed64b7b7526}
    @Test()
    void setSizeEndTextWhenSizeEndTextIsNull() {
        /* Branches:
         * (sizeEndText == null) : true  #  inside setSizeEndText method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setSizeEndText((String) null);
    }

    //Sapient generated method id: ${b18e0af2-ecd1-3b74-8dfc-007519d104fd}
    @Test()
    void getSummaryObjectStartTextTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setSummaryObjectStartText("summaryObjectStartText1");

        //Act Statement(s)
        String result = target.getSummaryObjectStartText();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("summaryObjectStartText1")));
    }

    //Sapient generated method id: ${cafa55ff-0718-3191-9252-38f25981ffd0}
    @Test()
    void setSummaryObjectStartTextWhenSummaryObjectStartTextIsNull() {
        /* Branches:
         * (summaryObjectStartText == null) : true  #  inside setSummaryObjectStartText method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setSummaryObjectStartText((String) null);
    }

    //Sapient generated method id: ${db48e23f-592a-3f8b-9ec8-6de1a3114842}
    @Test()
    void getSummaryObjectEndTextTest() {
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();
        target.setSummaryObjectEndText("summaryObjectEndText1");

        //Act Statement(s)
        String result = target.getSummaryObjectEndText();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("summaryObjectEndText1")));
    }

    //Sapient generated method id: ${ed178d67-a7a2-3179-aa6d-0472352c9983}
    @Test()
    void setSummaryObjectEndTextWhenSummaryObjectEndTextIsNull() {
        /* Branches:
         * (summaryObjectEndText == null) : true  #  inside setSummaryObjectEndText method
         */
        //Arrange Statement(s)
        StandardToStringStyle target = new StandardToStringStyle();

        //Act Statement(s)
        target.setSummaryObjectEndText((String) null);
    }
}
