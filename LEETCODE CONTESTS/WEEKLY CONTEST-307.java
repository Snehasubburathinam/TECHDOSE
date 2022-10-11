class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int t=0;
        int n=energy.length;
        for(int i=0;i<n;i++){
            if(energy[i]>=initialEnergy){
                int d=energy[i]-initialEnergy;
                t+=d+1;
                initialEnergy+=d+1;
            }
            if(experience[i]>=initialExperience){
                int d=experience[i]-initialExperience;
                t+=d+1;
                initialExperience+=d+1;
            }
             initialEnergy-=energy[i];
             initialExperience+=experience[i];
            
        }
      return t;
    }
}
