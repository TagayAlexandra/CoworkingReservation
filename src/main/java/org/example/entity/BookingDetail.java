package org.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class BookingDetail {
    private Long id;
    private LocalDate date;

    private LocalTime startTime;
    private LocalTime endTime;

    private Long workSpaceId;

    private String owner;


    public BookingDetail() {
    }

    public BookingDetail(Long id, LocalDate date, LocalTime startTime, LocalTime endTime, Long workSpaceId, String owner) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workSpaceId = workSpaceId;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getWorkSpaceId() {
        return workSpaceId;
    }

    public void setWorkSpaceId(Long workSpaceId) {
        this.workSpaceId = workSpaceId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingDetail that = (BookingDetail) o;
        return Objects.equals(id, that.id) && Objects.equals(date, that.date) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(workSpaceId, that.workSpaceId) && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, startTime, endTime, workSpaceId, owner);
    }

    @Override
    public String toString() {
        return "BookingDetail{" +
                "id=" + id +
                ", date=" + date +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", workSpaceId=" + workSpaceId +
                ", owner='" + owner + '\'' +
                '}';
    }
}
