package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {
    Integer PolicyNum;
    String InsuranceType;
    Integer AccountNum;
    String AccountType;
    String BankName;
    String BankBranch;


}
