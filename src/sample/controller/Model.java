package sample.controller;

import java.util.ArrayList;

public class Model
{
  //  private static ListOfDataObject listOfDataObject;
  private static ArrayList<Member> members;

  public Model()
  {
    members = new ArrayList<>();
    members.add(new Member("Mark", "51408516"));
    members.add(new Member("Andreas", "29276508"));
    members.add(new Member("Line", "29454999"));
  }

  public static ArrayList<Member> getMembers()
  {
    return members;
  }

  public Member getMemberByName(String name)
  {
    for (Member member : members)
    {
      if (member.getName().equalsIgnoreCase(name))
        return member;
    }
    return null;
  }

  public void addMember(Member member)
  {
    members.add(member);
  }

  public void removeMember(String name)
  {
    for (Member member : members)
    {
      if (member.getName().equalsIgnoreCase(name))
        members.remove(member);
    }
  }
}