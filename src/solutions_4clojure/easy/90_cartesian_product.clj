(defn cartesian [f s] (set (mapcat (fn [e] (#(map (fn [e] [e %1]) %2) e f )) s)))

(= (cartesian #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})


(= (cartesian #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})


(= 300 (count (cartesian (into #{} (range 10))
                (into #{} (range 30)))))
