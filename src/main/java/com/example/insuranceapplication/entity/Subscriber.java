package com.example.insuranceapplication.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscribers")
public class Subscriber {

	@Id
    @Column(name = "subscriber_id")
    private int subscriberId;

    @Column(name = "email")
    private String email;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "terminated_date")
    private LocalDate terminatedDate;

    @Column(name = "person_id")
    private int personId;

    @Column(name = "plan_id")
    private Integer planId;

    @Column(name = "date_of_last_d0120")
    private LocalDate dateOfLastD0120;

    @Column(name = "date_of_last_d0140")
    private LocalDate dateOfLastD0140;

    @Column(name = "date_of_last_d0150")
    private LocalDate dateOfLastD0150;

    @Column(name = "date_of_last_d0180")
    private LocalDate dateOfLastD0180;

    @Column(name = "date_of_last_d0210")
    private LocalDate dateOfLastD0210;

    @Column(name = "date_of_last_d0272")
    private LocalDate dateOfLastD0272;

    @Column(name = "date_of_last_d0274")
    private LocalDate dateOfLastD0274;

    @Column(name = "date_of_last_d0330")
    private LocalDate dateOfLastD0330;

    @Column(name = "date_of_last_d1110")
    private LocalDate dateOfLastD1110;

    @Column(name = "date_of_last_d1120")
    private LocalDate dateOfLastD1120;

    @Column(name = "date_of_last_d4341")
    private LocalDate dateOfLastD4341;

    @Column(name = "date_of_last_d4342")
    private LocalDate dateOfLastD4342;

    @Column(name = "date_of_last_d4910")
    private LocalDate dateOfLastD4910;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", insertable=false, updatable=false)
    private Person person;
    
    @ManyToOne
    @JoinColumn(name = "plan_id", insertable=false, updatable=false)
    private Plan plan;
	
	// default
	public Subscriber() {
		super();
	}

	// constructor without call to super
	public Subscriber(int subscriberId, String email,
			LocalDate effectiveDate, LocalDate terminatedDate, int personId, int planId) {
		setSubscriberId(subscriberId);
		setEmail(email);
		setEffectiveDate(effectiveDate);
		setTerminatedDate(terminatedDate);
	}
	

	public int getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDate getTerminatedDate() {
		return terminatedDate;
	}

	public void setTerminatedDate(LocalDate terminatedDate) {
		this.terminatedDate = terminatedDate;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public LocalDate getDateOfLastD0120() {
		return dateOfLastD0120;
	}

	public void setDateOfLastD0120(LocalDate dateOfLastD0120) {
		this.dateOfLastD0120 = dateOfLastD0120;
	}

	public LocalDate getDateOfLastD0140() {
		return dateOfLastD0140;
	}

	public void setDateOfLastD0140(LocalDate dateOfLastD0140) {
		this.dateOfLastD0140 = dateOfLastD0140;
	}

	public LocalDate getDateOfLastD0150() {
		return dateOfLastD0150;
	}

	public void setDateOfLastD0150(LocalDate dateOfLastD0150) {
		this.dateOfLastD0150 = dateOfLastD0150;
	}

	public LocalDate getDateOfLastD0180() {
		return dateOfLastD0180;
	}

	public void setDateOfLastD0180(LocalDate dateOfLastD0180) {
		this.dateOfLastD0180 = dateOfLastD0180;
	}

	public LocalDate getDateOfLastD0210() {
		return dateOfLastD0210;
	}

	public void setDateOfLastD0210(LocalDate dateOfLastD0210) {
		this.dateOfLastD0210 = dateOfLastD0210;
	}

	public LocalDate getDateOfLastD0272() {
		return dateOfLastD0272;
	}

	public void setDateOfLastD0272(LocalDate dateOfLastD0272) {
		this.dateOfLastD0272 = dateOfLastD0272;
	}

	public LocalDate getDateOfLastD0274() {
		return dateOfLastD0274;
	}

	public void setDateOfLastD0274(LocalDate dateOfLastD0274) {
		this.dateOfLastD0274 = dateOfLastD0274;
	}

	public LocalDate getDateOfLastD0330() {
		return dateOfLastD0330;
	}

	public void setDateOfLastD0330(LocalDate dateOfLastD0330) {
		this.dateOfLastD0330 = dateOfLastD0330;
	}

	public LocalDate getDateOfLastD1110() {
		return dateOfLastD1110;
	}

	public void setDateOfLastD1110(LocalDate dateOfLastD1110) {
		this.dateOfLastD1110 = dateOfLastD1110;
	}

	public LocalDate getDateOfLastD1120() {
		return dateOfLastD1120;
	}

	public void setDateOfLastD1120(LocalDate dateOfLastD1120) {
		this.dateOfLastD1120 = dateOfLastD1120;
	}

	public LocalDate getDateOfLastD4341() {
		return dateOfLastD4341;
	}

	public void setDateOfLastD4341(LocalDate dateOfLastD4341) {
		this.dateOfLastD4341 = dateOfLastD4341;
	}

	public LocalDate getDateOfLastD4342() {
		return dateOfLastD4342;
	}

	public void setDateOfLastD4342(LocalDate dateOfLastD4342) {
		this.dateOfLastD4342 = dateOfLastD4342;
	}

	public LocalDate getDateOfLastD4910() {
		return dateOfLastD4910;
	}

	public void setDateOfLastD4910(LocalDate dateOfLastD4910) {
		this.dateOfLastD4910 = dateOfLastD4910;
	}
	
	public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dateOfLastD0120, dateOfLastD0140, dateOfLastD0150, dateOfLastD0180,
				dateOfLastD0210, dateOfLastD0272, dateOfLastD0274, dateOfLastD0330, dateOfLastD1110, dateOfLastD1120,
				dateOfLastD4341, dateOfLastD4342, dateOfLastD4910, effectiveDate, email, personId, planId, subscriberId,
				terminatedDate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscriber other = (Subscriber) obj;
		return Objects.equals(dateOfLastD0120, other.dateOfLastD0120)
				&& Objects.equals(dateOfLastD0140, other.dateOfLastD0140)
				&& Objects.equals(dateOfLastD0150, other.dateOfLastD0150)
				&& Objects.equals(dateOfLastD0180, other.dateOfLastD0180)
				&& Objects.equals(dateOfLastD0210, other.dateOfLastD0210)
				&& Objects.equals(dateOfLastD0272, other.dateOfLastD0272)
				&& Objects.equals(dateOfLastD0274, other.dateOfLastD0274)
				&& Objects.equals(dateOfLastD0330, other.dateOfLastD0330)
				&& Objects.equals(dateOfLastD1110, other.dateOfLastD1110)
				&& Objects.equals(dateOfLastD1120, other.dateOfLastD1120)
				&& Objects.equals(dateOfLastD4341, other.dateOfLastD4341)
				&& Objects.equals(dateOfLastD4342, other.dateOfLastD4342)
				&& Objects.equals(dateOfLastD4910, other.dateOfLastD4910)
				&& Objects.equals(effectiveDate, other.effectiveDate) && Objects.equals(email, other.email)
				&& personId == other.personId && planId == other.planId && subscriberId == other.subscriberId
				&& Objects.equals(terminatedDate, other.terminatedDate);
	}

	@Override
	public String toString() {
		return "Subscriber [subscriberId=" + subscriberId + ", email=" + email + ", effectiveDate=" + effectiveDate
				+ ", terminatedDate=" + terminatedDate + ", personId=" + personId + ", planId=" + planId
				+ ", dateOfLastD0120=" + dateOfLastD0120 + ", dateOfLastD0140=" + dateOfLastD0140 + ", dateOfLastD0150="
				+ dateOfLastD0150 + ", dateOfLastD0180=" + dateOfLastD0180 + ", dateOfLastD0210=" + dateOfLastD0210
				+ ", dateOfLastD0272=" + dateOfLastD0272 + ", dateOfLastD0274=" + dateOfLastD0274 + ", dateOfLastD0330="
				+ dateOfLastD0330 + ", dateOfLastD1110=" + dateOfLastD1110 + ", dateOfLastD1120=" + dateOfLastD1120
				+ ", dateOfLastD4341=" + dateOfLastD4341 + ", dateOfLastD4342=" + dateOfLastD4342 + ", dateOfLastD4910="
				+ dateOfLastD4910 + "]";
	}
	
}
