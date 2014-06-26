(defn cmp [op f s]
  (if (op f s)
    :lt
    (if (op s f)
      :gt
      :eq)))

(= :gt (cmp < 5 1))

(= :eq (cmp (fn [x y] (< (count x) (count y))) "pear" "plum"))

(= :lt (cmp (fn [x y] (< (mod x 5) (mod y 5))) 21 3))

(= :gt (cmp > 0 2))
