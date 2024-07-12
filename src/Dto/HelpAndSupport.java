package Dto;

import javax.persistence.*;

@Entity
@Table(name = "HelpAndSupport")
public class HelpAndSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HelpAndSupportId")
    private int helpAndSupportId;
    
    @Column(name = "Question")
    private String Question;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

    // Getters and Setters
    public int getHelpAndSupportId() {
        return helpAndSupportId;
    }

    public void setHelpAndSupportId(int helpAndSupportId) {
        this.helpAndSupportId = helpAndSupportId;
    }

    public My_Account getMyAccount() {
        return myAccount;
    }

    public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public void setMyAccount(My_Account myAccount) {
        this.myAccount = myAccount;
    }
}
