import java.util.HashSet;
import java.util.Set;
//Question 2
class SkillAnalyzer {
    public static void main(String[] args) {
        SkillAnalyzer analyzer = new SkillAnalyzer();

        Set<String> candidateA = new HashSet<>();
        candidateA.add("Java");
        candidateA.add("Python");

        Set<String> candidateB = new HashSet<>();
        candidateB.add("Python");
        candidateB.add("SQL");

        Set<String> uniqueSkills = analyzer.findUniqueSkills(candidateA, candidateB);
        System.out.println("Unique skills: " + uniqueSkills);
    }
    /**
     * TO-DO: Find skills present in one set but not both.
     * For example, if candidateA has {Java, Python} and candidateB has {Python, SQL},
     * the result should be {Java, SQL}.
     \*
     * @param candidateASkills The skills of the first candidate.
     * @param candidateBSkills The skills of the second candidate.
     * @return A new HashSet containing only the unique skills for each candidate.
     */
    public Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        Set<String> unionSet = new HashSet<>(candidateASkills);
        unionSet.addAll(candidateBSkills);

        Set<String> intersectionsSet = new HashSet<>(candidateASkills);
        intersectionsSet.retainAll(candidateBSkills);

        unionSet.removeAll(intersectionsSet);

        return unionSet;
    }
}