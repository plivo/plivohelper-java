package com.plivo.api.models.compliancedocument;

import com.plivo.api.models.base.BaseResponse;

public class ComplianceDocumentCreateResponse extends BaseResponse {
    private String endUserId;
    private String createdAt;
    private String documentId;
    private String documentTypeId;
    private String alias;
    private String fileName;


    private static class MetaInformation {
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String country;
        private String postalCode;
        private String lastName;
        private String firstName;
        private String dateOfBirth;
        private String uniqueIdentificationNumber;
        private String businessName;
        private String authorizedRepresentativeName;
        private String nationality;
      private enum typeOfUtility {
          water,electricity,gas, propertyRental, others
        };
        private String billId;
        private String typeOfId;
        private String placeOfBirth;
        private String dateOfIssue;
        private String dateOfExpiration;
        private String billDate;
        private String supportEmail;
        private String supportPhoneNumber;
        private String useCaseDescription;

        public MetaInformation() {

        }

        public String getLastName() {
            return lastName;
        }
        public String getAddressLine1() {
            return addressLine1;
        }
        public String getAddressLine2() {
            return addressLine2;
        }
        public String getCity() {
            return city;
        }
        public String getCountry() {
            return country;
        }
        public String getDateOfBirth() { return dateOfBirth; }
        public String getFirstName() {
            return firstName;
        }
        public String getPostalCode() {
            return postalCode;
        }

        public String getUniqueIdentificationNumber() { return uniqueIdentificationNumber; }
        public String getBusinessName() { return businessName; }
        public String getAuthorizedRepresentativeName() { return authorizedRepresentativeName; }
        public String getBillId() { return billId; }
        public String getTypeOfId() { return typeOfId; }
        public String getPlaceOfBirth() { return placeOfBirth; }
        public String getDateOfIssue() { return dateOfIssue; }
        public String getDateOfExpiration() { return dateOfExpiration; }
        public String getBillDate() { return billDate; }
        public String getSupportEmail() { return supportEmail; }
        public String getSupportPhoneNumber() { return supportPhoneNumber; }
        public String getUseCaseDescription() { return useCaseDescription; }

    }
}
