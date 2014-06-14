(defn rev [sq]
  (loop [a sq
         r []]
    (if (empty? a)
      r
      (recur (drop-last a) (conj r (last a))))))

(= (rev [1 2 3 4 5]) [5 4 3 2 1])

(= (rev (sorted-set 5 7 2 7)) '(7 5 2))

(= (rev (sorted-set 5 7 2 7)) '(7 5 2))
